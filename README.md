# google-cloud-compute-small-v1-lro
Google Compute Engine Small with LRO prototype

### Building
This repository depends on [gax-java/tree/diregapic-lro](https://github.com/vam-google/gax-java/tree/diregapic-lro)

#### To build
1. Build and install the `diregapic-lro` branch of `gax-java`:
  ```    
  git clone https://github.com/vam-google/gax-java.git
  cd gax-java
  git fetch --all
  git checkout diregapic-lro
  ./gradlew publishMavenJavaPublicationToMavenLocal
  ```
2. Checkout and build this repository:
  ```
  git clone https://github.com/vam-google/google-cloud-compute-small-v1-lro.git
  cd google-cloud-compute-small-v1-lro
  ./gradlew clean test
  ```
