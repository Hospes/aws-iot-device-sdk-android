# AWS IoT Device Android SDK

[ ![Download](https://api.bintray.com/packages/hospes/maven/ua.hospes.aws%3Aaws-iot-device-sdk-android/images/download.svg) ](https://bintray.com/hospes/maven/ua.hospes.aws%3Aaws-iot-device-sdk-android/_latestVersion)

This is the fork of [aws/aws-iot-device-sdk-java](https://github.com/aws/aws-iot-device-sdk-java). The main idea of this re-work was adaptetion common java sdk for android ecosystem.

## How to use it
Add dependency to my public maven repo:
```
buildscript {
    repositories {
        jcenter()
        ...
        maven { url "http://dl.bintray.com/hospes/maven" }
        ...
    }
}

allprojects {
    repositories {
        jcenter()
        ...
        maven { url "http://dl.bintray.com/hospes/maven" }
        ...
    }
}
```

Add dependency to build.gradle. This file commonly persists in you main app folder.
```gradle
dependencies {
    ...
    compile 'ua.hospes.aws:aws-iot-device-sdk-android:0.1.3'
    ...
}
```

## API Documentation
You'll find the API documentation for the SDK [here][api-docs].

## License
This SDK is distributed under the [Apache License, Version 2.0][apache-license-2]. For more information, see
LICENSE.txt and NOTICE.txt.

## Support
If you have technical questions about the AWS IoT Device SDK, use the [AWS IoT Forum][aws-iot-forum].
For any other questions about AWS IoT, contact [AWS Support][aws-support].

[aws-iot-protocol]: http://docs.aws.amazon.com/iot/latest/developerguide/protocols.html
[aws-iot-thing]: http://docs.aws.amazon.com/iot/latest/developerguide/iot-thing-shadows.html
[aws-iot-forum]: https://forums.aws.amazon.com/forum.jspa?forumID=210
[aws-iot-console]: http://aws.amazon.com/iot/
[latest-jar]: https://s3.amazonaws.com/aws-iot-device-sdk-java/aws-iot-device-sdk-java-LATEST.zip
[jackson-core]: https://github.com/FasterXML/jackson-core
[jackson-databind]: https://github.com/FasterXML/jackson-databind
[paho-mqtt-java-download]: https://eclipse.org/paho/clients/java/
[api-docs]: http://aws-iot-device-sdk-java-docs.s3-website-us-east-1.amazonaws.com/
[aws-iot-ecc-blog]: https://aws.amazon.com/blogs/iot/elliptic-curve-cryptography-and-forward-secrecy-support-in-aws-iot-3/
[aws-support]: https://aws.amazon.com/contact-us
[apache-license-2]: http://www.apache.org/licenses/LICENSE-2.0
