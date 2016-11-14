# react-native-sp
Shared preference for react-native. Only for Android

# How to install
````
> npm install react-native-sp --save
````

# Project setup
Run below command on your project root folder.
````
> react-native link react-native-sp
````

# How to use

## Linking this library
- Run link command on your project root folder.
````
> react-native link react-native-sp
````

## Mandatory
You have to set your default value before you use SharedPreferences.

## Example
````javascript
import SharedPreferences from 'react-native-sp';

const rnspDefaultValue = {
  myStrKey : 'default',
  myIntKey : -1,
  myBoolKey : false
};

class example extends Component {
  constructor(props) {
    ...
    SharedPreferences.init(rnspDefaultValue);
  }

  componentDidMount() {
    // Will return your default value if there's no matched value
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

````

# License
Copyright (c) 2016-present ZENOME, Inc.

Permission is hereby granted, free of charge, to any person
obtaining a copy of this software and associated documentation
files (the "Software"), to deal in the Software without
restriction, including without limitation the rights to use,
copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the
Software is furnished to do so, subject to the following
conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.

