# react-native-sp
Shared preference for react-native. Only for Android


# How to install
~~~
> npm install react-native-sp
~~~

# Project setup
Run below command on your project root folder.
~~~
> react-native link react-native-sp
~~~

# How to use
Example
````javascript
import SharedPreference from 'react-native-sp';

SharedPreference.putString('myEmail', 'myEmailAddress@');
SharedPreference.getString('myEmail', 'default')
.then(result => console.log(result));

SharedPreference.putInteger('myPin', 123456789);
SharedPreference.getString('myEmail', -1)
.then(result => console.log(result));

SharedPreference.putBoolean('Login', true);
SharedPreference.getBoolean('Login', false)
.then(result => console.log(result));
````

# License
MIT
