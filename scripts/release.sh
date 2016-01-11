#!/bin/bash

read -p "Do you really want to deploy to maven central repository (yes/no)? "

# check if prompted to continue
if [[ ! $REPLY =~ ^[Yy]$ ]]; then
    exit 1
fi

# check if the input parameter RELEASE_VERSION is valid
RELEASE_VERSION="$1"
if [[ ! $RELEASE_VERSION =~ ^([0-9]+\.[0-9]+\.[0-9])(\-SNAPSHOT){0,1}$ ]]; then
    echo "Error: RELEASE_VERSION must be in X.Y.Z(-SNAPSHOT) format, but was $RELEASE_VERSION"
    exit 1
fi

# some config options

# get directory of this script
SCRIPTDIR=`dirname "$0"`

# relative path to the projects pom.xml
POMFILE="$SCRIPTDIR/../src/pom.xml"

# your git username
GITUSERNAME="dnlkoch"

# set the new version
#mvn versions:set \
#    -DgenerateBackupPoms=false \
#    -DnewVersion="$RELEASE_VERSION" \
#    --file "$POMFILE"

mvn release:clean release:prepare --batch-mode -DreleaseVersion=$RELEASE_VERSION

#mvn -Dusername=$GITUSERNAME release:prepare

# add all updated files
#git add -u
# commit the files
#git commit -m "Update version numbers for $RELEASE_VERSION"
# create release tag
#git tag -a "v$RELEASE_VERSION" -m "Release $RELEASE_VERSION"
# push the newly created tag
#git push origin "v$RELEASE_VERSION"

# update nexus repository
#mvn clean deploy -P release-artifact
