import React from 'react';
import {Text, View} from 'react-native';

let app;
if (__DEV__) {
  app = require("./target/scala-2.13/app-fastopt.js").app;
} else {
  module.exports = () => {
    return <View style={{flex: 1, justifyContent: "center", alignItems: "center"}}>
      <Text style={{textAlign: "center"}}>
        Scala.js opt mode has not been enabled in App.js, please uncomment the code for it.
      </Text>
    </View>;
  }

  // uncomment the following line to enable opt building
  // app = require("./target/scala-2.13/app-opt.js").app;
}

export default app;
