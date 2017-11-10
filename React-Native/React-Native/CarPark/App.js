import React from 'react';
import { StyleSheet, Text, View } from 'react-native';
import MapView from 'react-native-maps';

export default class App extends React.Component {
  render() {

      var markers = [{
          latitude:46.76952,
          longitude:23.590444,
      }];

    return (
      <View style={styles.container}>

          <Mapview style={styles.map}
                   region={{
                   latitude:46.769528,
                   longitude:23.590444,
                   latitudeDelta:0.1,
                   longitudeDelta:0.1
                   }}
          >
          <MapView.Marker
              coordinate={{
                  latitude:46.76952,
                  longitude:23.590444}}
              title={"title"}
              description={"description"}
              />

          </Mapview>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
      position: 'absolute',
      top: 0,
      left: 0,
      bottom: 0,
      right: 0,
      justifyContent: 'flex-end',
      alignItems: 'center'
  },
    map: {
        position: 'absolute',
        top: 0,
        left: 0,
        bottom: 0,
        right: 0,
    }
});
