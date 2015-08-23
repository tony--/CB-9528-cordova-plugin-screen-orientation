/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
*/

var argscheck = require('cordova/argscheck'),
    exec = require('cordova/exec'),
    utils = require('cordova/utils'),

    orientation = {

    	angle: 0,
    	type: 'portrait-primary',

    	//can't use variable/property-based enums because spec calls for hyphenated members
		validOrientationTypes = [
		  'portrait-primary',
		  'portrait-secondary',
		  'landscape-primary',
		  'landscape-secondary',
		],

    	//can't use variable/property-based enums because spec calls for hyphenated members
		validOrientationLockType = [
		  'any',
		  'natural',
		  'landscape',
		  'portrait'
		  'portrait-primary',
		  'portrait-secondary',
		  'landscape-primary',
		  'landscape-secondary',
		],

        /**
         * Locks the screen.
         * @param {OrientationLockType} orientation - the orientation that the screen will be locked to, valid values are
         * any, natural, landscape, portrait, portrait-primary, portrait-secondary, landscape-primary, landscape-secondary
         * @param successCallback
         * @param errorCallback
         */
        lock:function(orientation, successCallback, errorCallback) {
            argscheck.checkArgs('s', 'orientation.lock', arguments);

            //orientation must be a valid OrientationLockType
            if(validOrientationLockType.indexOf(orientation) == -1) {
            	throw TypeError(orientation + ' is not a valid OrientationLockType.  The valid types are any, natural, landscape, portrait, portrait-primary, portrait-secondary, landscape-primary, landscape-secondary.');
            }

            // lock the screen
            exec(successCallback, errorCallback, "ScreenOrientation", "lock", [orientation]);
        },

        /**
         * Unlocks the screen.
         */
        unlock:function() {
            // unlock the screen
            exec(null, null, "ScreenOrientation", "unlock", []);
        },

    };

module.exports = orientation;