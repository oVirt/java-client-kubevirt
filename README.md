build shadow jar:
`./gradlew shadowJar`

publish to mavem local:
`./gradlew uploadShadow`

generate kubevirt sources (model + api):
java -jar swagger-codegen-cli-2.4.9.jar generate -i kubevirt-swagger.json -c config.json -l java -o _out
