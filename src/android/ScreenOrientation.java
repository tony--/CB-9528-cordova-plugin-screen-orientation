/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
*/
package org.apache.cordova.screenorientation;

public class ScreenOrientation extends CordovaPlugin {

    private CallbackContext callbackContext;              // Keeps track of the JS callback context.

    public enum ValidOrientationType {
        PORTRAIT_PRIMARY (5),
        PORTRAIT_SECONDARY (6),
        LANDSCAPE_PRIMARY (7),
        LANDSCAPE_SECONDARY (8);

        final int nativeInt;

        private static ValidOrientationType sTypes[] = {
            null, null, null, null, null, PORTRAIT_PRIMARY, PORTRAIT_SECONDARY, LANDSCAPE_PRIMARY, LANDSCAPE_SECONDARY
        };
        
        ValidOrientationType(int ni) {
            this.nativeInt = ni;
        }

        static ValidOrientationType nativeToValidOrientationType(int ni) {
            return sTypes[ni];
        }
    }

    public enum ValidOrientationLockType {
        ANY (1),
        NATURAL (2),
        LANDSCAPE (3),
        PORTRAIT (4),
        PORTRAIT_PRIMARY (5),
        PORTRAIT_SECONDARY (6),
        LANDSCAPE_PRIMARY (7),
        LANDSCAPE_SECONDARY (8);

        final int nativeInt;

        private static ValidOrientationLockType sTypes[] = {
            null, ANY, NATURAL, LANDSCAPE, PORTRAIT, PORTRAIT_PRIMARY, PORTRAIT_SECONDARY, LANDSCAPE_PRIMARY, LANDSCAPE_SECONDARY
        };
        
        ValidOrientationLockType(int ni) {
            this.nativeInt = ni;
        }

        static ValidOrientationLockType nativeToValidOrientationLockType(int ni) {
            return sTypes[ni];
        }
    }

    ValidOrientationLockType orientationLock;

    /**
     * Sets the context of the Command. This can then be used to do things like
     * get file paths associated with the Activity.
     *
     * @param cordova The context of the main Activity.
     * @param webView The associated CordovaWebView.
     */
    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
    }

    /**
     * Executes the request.
     *
     * @param action        The action to execute.
     * @param args          The exec() arguments.
     * @param callbackId    The callback id used when calling back into JavaScript.
     * @return              Whether the action was valid.
     */
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        if (action.equals("lock")) {
        }
        else if (action.equals("unlock")) {
        } else {
          // Unsupported action
            return false;
        }

    }

    public void onDestroy() {
    }

    //--------------------------------------------------------------------------
    // LOCAL METHODS
    //--------------------------------------------------------------------------
    //
    private void lock() {

    }

    private void unlock() {
    }

}