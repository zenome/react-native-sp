/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View
} from 'react-native';

import SharedPreferences from 'react-native-sp';

class example extends Component {
  constructor(props) {
    super(props);
    this.state = {
      string : '-',
      integer : '-999',
      bool : 'false'
    }
  }

  componentWillMount() {
    SharedPreferences.putString('mykey', 'myEmailAddress@');
    SharedPreferences.getString('mykey', 'default')
      .then(result => this.setState({string : result}));
 
    SharedPreferences.putInteger('myIntKey', 12345678);
    SharedPreferences.getInteger('myIntKey', -1)
      .then(result => this.setState({integer : result}));
 
    SharedPreferences.putBoolean('myBoolKey', true);
    SharedPreferences.getBoolean('myBoolKey', false)
      .then(result => this.setState({bool : result}));
  }

  render() {
    return (
      <View style={styles.container}>
        <Text style={styles.welcome}>
          Welcome to react-native-sp
        </Text>
        <Text style={styles.instructions}>str - {this.state.string} </Text>
        <Text style={styles.instructions}>Integer - {this.state.integer} </Text>
        <Text style={styles.instructions}>Boolean - {this.state.bool ? 'true' : 'false'} </Text>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
});

AppRegistry.registerComponent('example', () => example);
