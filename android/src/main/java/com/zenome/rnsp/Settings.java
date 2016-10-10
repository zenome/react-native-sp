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

import android.content.Context;
import android.content.SharedPreferences;

public class Settings {
  private SharedPreferences mSetting = null;
  private static Settings instance = new Settings();

  public static Settings Get() {
        return instance;
    }

  public Settings init(Context aContext) {
      mSetting = aContext.getSharedPreferences("ZENOME_RNSP", 0);
      return instance;
  }

  public void clear() {
      mSetting.edit().clear().commit();
  }

  public Settings putString(String aKey, String aValue) {
      mSetting.edit().putString(aKey, aValue).commit();
      return instance;
  }

  public String getString(String aKey, String aDefault) {
      return mSetting.getString(aKey, aDefault);
  }

  public Settings setInteger(String aKey, Integer aValue) {
      mSetting.edit().putLong(aKey, aValue.longValue()).commit();
      return instance;
  }
  public Long getInteger(String aKey, Integer aDefault) {
      return mSetting.getLong(aKey, aDefault.longValue());
  }

  public Settings setBoolean(String aKey, Boolean aValue) {
      mSetting.edit().putBoolean(aKey, aValue.booleanValue()).commit();
      return instance;
  }

  public Boolean getBoolean(String aKey, Boolean aDefault) {
      return mSetting.getBoolean(aKey, aDefault);
  }

  public Settings remove(String aKey) {
    mSetting.edit().remove(aKey).commit();
    return instance;
  }
}
