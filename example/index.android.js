import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  TouchableOpacity,
  View
} from 'react-native';

import SharedPreferences from 'react-native-sp';

const rnspDefaultValue = {
  myStrKey : 'default',
  myIntKey : -1,
  myBoolKey : false
};

class example extends Component {
  constructor(props) {
    super(props);
    this.state = {
      string : '-',
      integer : '-999',
      bool : 'false'
    }

    SharedPreferences.init(rnspDefaultValue);
  }

  componentDidMount() {
    SharedPreferences.getString('mykey')
      .then(result => this.setState({string : result}));
 
    SharedPreferences.getInteger('myIntKey')
      .then(result => this.setState({integer : result}));
 
    SharedPreferences.getBoolean('myBoolKey')
      .then(result => this.setState({bool : result}));
  }

  setValue() {
    SharedPreferences.putValue('mykey', 'this@that');
    SharedPreferences.putValue('myIntKey', 1234567890);
    SharedPreferences.putValue('myBoolKey', true);

    SharedPreferences.getString('mykey')
      .then(result => this.setState({string : result}));
    SharedPreferences.getInteger('myIntKey')
      .then(result => this.setState({integer : result}));
    SharedPreferences.getBoolean('myBoolKey')
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
        <TouchableOpacity onPress={this.setValue.bind(this)}>
          <Text>Set SharedPreferences</Text>
        </TouchableOpacity>
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
