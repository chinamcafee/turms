/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.turms.server.common.infra.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author James Chen
 */
public final class MapUtil {

    private MapUtil() {
    }

    public static int getCapability(int expectedSize) {
        return (int) (expectedSize / 0.75F + 1.0F);
    }

    public static <K, V> Map<K, V> deepMerge(Map<K, V> baseMap,
                                             Map<? extends K, ? extends V> mapToMerge,
                                             boolean appendCollectionElements) {
        for (Map.Entry<? extends K, ? extends V> entry : mapToMerge.entrySet()) {
            K key = entry.getKey();
            V existingValue = baseMap.get(key);
            V valueToMerge = entry.getValue();
            // We don't need to handle the case of arrays
            // just because we don't use arrays.
            if (appendCollectionElements
                    && existingValue instanceof Collection existingValues
                    && valueToMerge instanceof Collection valuesToMerge) {
                if (!existingValues.containsAll(valuesToMerge)) {
                    existingValues.addAll(valuesToMerge);
                }
            } else if (existingValue instanceof Map && valueToMerge instanceof Map) {
                deepMerge((Map) existingValue, (Map) valueToMerge, appendCollectionElements);
            } else if (existingValue == null || !existingValue.equals(valueToMerge)) {
                baseMap.put(key, valueToMerge);
            }
        }
        return baseMap;
    }

    public static <K, V> Map<K, V> merge(Map<K, V> map1, Map<K, V> map2) {
        Map<K, V> result = new HashMap<>(getCapability(map1.size() + map2.size()));
        result.putAll(map1);
        result.putAll(map2);
        return result;
    }

}
