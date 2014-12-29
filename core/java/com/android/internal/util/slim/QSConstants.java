/*
 * Copyright (C) 2015 The SlimRoms Open Source Project
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
 * limitations under the License
 */

package com.android.internal.util.slim;

import java.util.ArrayList;

public class QSConstants {

    public static final String TILE_WIFI = "toggleWifi";
    public static final String TILE_LOCATION = "toggleLocation";
    public static final String TILE_BLUETOOTH = "toggleBluetooth";
    public static final String TILE_HOTSPOT = "toggleHotspot";
    public static final String TILE_DATA = "toggleData";
    public static final String TILE_LOCKSCREEN = "toggleLockScreen";
    public static final String TILE_ROTATION = "toggleRotation";
    public static final String TILE_AIRPLANE = "toggleAirplane";
    public static final String TILE_FLASHLIGHT = "toggleFlashlight";
    public static final String TILE_LTE = "toggleLte";
    public static final String TILE_NFC = "toggleNfc";
    public static final String TILE_ADB_NETWORK = "toggleNetworkAdb";
    public static final String TILE_DDS = "toggleDds";
    public static final String TILE_APN = "toggleApn";
    public static final String TILE_VISUALIZER = "toggleVisualizer";
    public static final String TILE_INVERSION = "toggleInversion";
    public static final String TILE_CELLULAR = "toggleCell";
    public static final String TILE_CAST = "toggleCast";
    public static final String TILE_ROAMING = "toggleRoaming";
    public static final String TILE_COMPASS = "toggleRompass";

    // Order matters
    protected static final ArrayList<String> TILES_DEFAULT = new ArrayList<String>();

    static {
        TILES_DEFAULT.add(TILE_WIFI);
        TILES_DEFAULT.add(TILE_BLUETOOTH);
        TILES_DEFAULT.add(TILE_CELLULAR);
        TILES_DEFAULT.add(TILE_AIRPLANE);
        TILES_DEFAULT.add(TILE_ROTATION);
        TILES_DEFAULT.add(TILE_FLASHLIGHT);
        TILES_DEFAULT.add(TILE_LOCATION);
        TILES_DEFAULT.add(TILE_CAST);
    }

    protected static final ArrayList<String> TILES_AVAILABLE = new ArrayList<String>();

    static {
        TILES_AVAILABLE.addAll(TILES_DEFAULT);
        TILES_AVAILABLE.add(TILE_INVERSION);
        TILES_AVAILABLE.add(TILE_HOTSPOT);
        TILES_AVAILABLE.add(TILE_DATA);
        TILES_AVAILABLE.add(TILE_ROAMING);
        TILES_AVAILABLE.add(TILE_DDS);
        TILES_AVAILABLE.add(TILE_APN);
        TILES_AVAILABLE.add(TILE_ADB_NETWORK);
        TILES_AVAILABLE.add(TILE_NFC);
        TILES_AVAILABLE.add(TILE_COMPASS);
        TILES_AVAILABLE.add(TILE_LOCKSCREEN);
        TILES_AVAILABLE.add(TILE_LTE);
        TILES_AVAILABLE.add(TILE_VISUALIZER);
    }
}
