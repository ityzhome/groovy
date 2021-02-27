#!/usr/bin/env groovy

// Jenkinsfile (Declarative Pipeline)

pipeline {
  agent any

  environment {
        AZURE_SUBSCRIPTION_ID='783ed336-9aff-4c71-b6c0-8efb879033a5'
        AZURE_TENANT_ID='cc0361ca-deca-4db3-b421-ee1ca53c7f00'
        AZURE_CLIENT_SECRET='SWKn1aWnNy-tu_Jn28_~GVdd.5y1gyp2eM'
        AZURE_CLIENT_ID='6a174562-61ac-45e2-b6b9-334a797c00ce'
    }

  stages {
    stage('Stage 1') {
      steps {
        echo 'Hello world!'
        sh ''
          az login --service-principal -u "6a174562-61ac-45e2-b6b9-334a797c00ce" -p "SWKn1aWnNy-tu_Jn28_~GVdd.5y1gyp2eM"-t "cc0361ca-deca-4db3-b421-ee1ca53c7f00"
          echo 'Hello world!'
        ''
      }
    }

  }
}
