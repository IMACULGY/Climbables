/*
 * Copyright 2018 MovingBlocks
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
package org.terasology.climbables;

import org.terasology.entitySystem.Component;
import org.terasology.math.Side;
import org.terasology.math.geom.Vector3i;

public class ClamberComponent implements Component {

    public PlacingMode placingMode = PlacingMode.NORMAL;
    public boolean support = false;
    public int maxPlacementDistance = 3;

    public Vector3i getPlacingModeDirection() {
        switch (this.placingMode) {
            case ROPING:
                return Side.BOTTOM.getVector3i();
            case STACKING:
                return Side.TOP.getVector3i();
            case NORMAL:
                return Vector3i.zero();
        }
        return Vector3i.zero();
    }
}
