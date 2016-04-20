<!---
# license: Licensed to the Apache Software Foundation (ASF) under one
#         or more contributor license agreements.  See the NOTICE file
#         distributed with this work for additional information
#         regarding copyright ownership.  The ASF licenses this file
#         to you under the Apache License, Version 2.0 (the
#         "License"); you may not use this file except in compliance
#         with the License.  You may obtain a copy of the License at
#
#           http://www.apache.org/licenses/LICENSE-2.0
#
#         Unless required by applicable law or agreed to in writing,
#         software distributed under the License is distributed on an
#         "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
#         KIND, either express or implied.  See the License for the
#         specific language governing permissions and limitations
#         under the License.
-->

# cordova-plugin-screen-orientation

This plugin provides an implementation of the [Screen Orientation API](http://www.w3.org/TR/2015/WD-screen-orientation-20151223/), which provides the ability to read the screen orientation type and angle, to be informed when the screen orientation state changes, and be able to lock the screen orientation to a specific state.

Access is via a global `navigator.screen.orientation` object.

Although the object is attached to the global scoped `navigator`, it is not available until after the `deviceready` event.

    document.addEventListener("deviceready", onDeviceReady, false);
    function onDeviceReady() {
        console.log(navigator.screen.orientation);
    }

## Installation

    cordova plugin add cordova-plugin-screen-orientation

## Supported Platforms

- Android
- iOS

## Future Platforms

- Windows
- Browser

## Properties

- navigator.screen.orientation.angle
- navigator.screen.orientation.type

## Methods

- navigator.screen.orientation.lock(orientation)
- navigator.screen.orientation.unlock()

## Events

- change

## navigator.screen.orientation.angle

The current angle in degrees

## navigator.screen.orientation.type

One of the following:

    "portrait-primary",
    "portrait-secondary",
    "landscape-primary",
    "landscape-secondary"

## navigator.screen.orientation.lock

This method is used to lock the orientation of the screen.
Orientation can be locked to one of the following:

    "any",
    "natural",
    "landscape",
    "portrait",
    "portrait-primary",
    "portrait-secondary",
    "landscape-primary",
    "landscape-secondary"

## navigator.screen.orientation.unlock

This method is used to release the orientation lock - this resets it to the default orientation, which may vary by platform, device and application.  Application authors may set the default orientation via [the cordova orientation preference](https://cordova.apache.org/docs/en/edge/config_ref_index.md.html#The%20config.xml%20File_multi_platform_preferences).

## change

This event fires when the orientation changes.
