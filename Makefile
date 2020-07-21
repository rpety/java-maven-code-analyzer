.PHONY: all parent rules simple-application

all: rules parent simple-application

parent:
	mvn clean install -f parent/pom.xml

rules:
	mvn clean install -f rules/pom.xml

simple-application:
	mvn clean install -f simple-application/pom.xml