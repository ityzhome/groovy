#!/usr/bin/env groovy

// Jenkinsfile (Declarative Pipeline)

pipeline {
  agent any



  stages {
    stage('Stage 1') {
      steps {
        withCredentials([azureServicePrincipal('azure_service_principal')]) {
        echo 'Hello world!'
        sh ''
          az login --service-principal -u $AZURE_CLIENT_ID -p $AZURE_CLIENT_SECRET -t $AZURE_TENANT_ID
          az account set -s $AZURE_SUBSCRIPTION_ID
        ''
        }
      }
    }

  }
}
