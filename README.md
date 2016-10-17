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
SharedPreference.getInteger('myPin', -1)
.then(result => console.log(result));

SharedPreference.putBoolean('Login', true);
SharedPreference.getBoolean('Login', false)
.then(result => console.log(result));
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
