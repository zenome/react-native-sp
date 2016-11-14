/**
 * Copyright (c) 2016-present ZENOME, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the MIT-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

'use strict';

const zenome_sp = require('react-native').NativeModules.ZENOMESharedPreferences;

class zenome_rnsp {
  constructor() {
  }

  init(defaultValue) {
    this.defaultValue = defaultValue;
  }

  putString(keyPref, value) {
    zenome_sp.putString(keyPref, value)
  }

  getString(keyPref) {
    if (this.defaultValue === undefined) {
      throw 'react-native-sp::getBoolean - init function is not called yet.';
    }

    return zenome_sp.getString(keyPref, this.defaultValue[keyPref]);
  }

  putBoolean(keyPref, value) {
    zenome_sp.putBoolean(keyPref, value);
  }
 
  getBoolean(keyPref) {
    if (this.defaultValue === undefined) {
      throw 'react-native-sp::getBoolean - init function is not called yet.';
    }

    return zenome_sp.getBoolean(keyPref, this.defaultValue[keyPref]);
  }

  putInteger(keyPref, value) {
    zenome_sp.putInteger(keyPref, value);
  }
 
  getInteger(keyPref) {
    if (this.defaultValue === undefined) {
      throw 'react-native-sp::getBoolean - init function is not called yet.';
    }

    return zenome_sp.getInteger(keyPref, this.defaultValue[keyPref]);
  }

  putValue(keyPref, value) {
    if (typeof value === 'number') {
      this.putInteger(keyPref, value);
    } else if (typeof value === 'string') {
      this.putString(keyPref, value);
    } else if (typeof value === 'boolean') {
      this.putBoolean(keyPref, value);
    } else {
      throw `${typeof value} is not supported.`
    }
  }
}

module.exports = new zenome_rnsp();
