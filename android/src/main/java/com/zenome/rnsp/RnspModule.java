/*
 * Copyright (c) 2016-present ZENOME, Inc.
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package com.zenome.rnsp;

import android.util.Log;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

public class RnspModule extends ReactContextBaseJavaModule {
  private final static String TAG = "RnspModule";

  public RnspModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return "ZENOMESharedPreferences";
  }


  @ReactMethod
  public void putString(String aKey, String aValue) {
    Settings.Get().init(getReactApplicationContext());
    Settings.Get().putString(aKey, aValue);
  }

  @ReactMethod
  public void getString(String aKey, String aDefault, Promise aPromise) {
    Settings.Get().init(getReactApplicationContext());
    aPromise.resolve(Settings.Get().getString(aKey, aDefault));
  }

  @ReactMethod
  public void putInteger(String aKey, Integer aValue) {
    Settings.Get().init(getReactApplicationContext());
    Settings.Get().setInteger(aKey, aValue);
  }

  @ReactMethod
  public void getInteger(String aKey, Integer aDefault, Promise aPromise) {
    Settings.Get().init(getReactApplicationContext());
    aPromise.resolve(Settings.Get().getInteger(aKey, aDefault));
  }

  @ReactMethod
  public void putBoolean(String aKey, Boolean aValue) {
    Settings.Get().init(getReactApplicationContext());
    Settings.Get().setBoolean(aKey, aValue);
  }

  @ReactMethod
  public void getBoolean(String aKey, Boolean aDefault, Promise aPromise) {
    Settings.Get().init(getReactApplicationContext());
    aPromise.resolve(Settings.Get().getBoolean(aKey, aDefault));
  }

  @ReactMethod
  public void clear(){
    Settings.Get().init(getReactApplicationContext());
    Settings.Get().clear();
  }
}
