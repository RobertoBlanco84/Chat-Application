# Chat-Application
Java EE School Project

## Getting Started
- To get a copy of Chat-Application you have to clone or fork the project to your local machine
- URL: https://github.com/RobertoBlanco84/Chat-Application.git


## Prerequisites
- Eclipse(Java EE)
- Maven
- TomEE
- JSF
- PrimeFaces


## Installing
### Eclipse Installer

- http://www.eclipse.org/downloads/eclipse-packages/?show_instructions=TRUE
- When file is downloaded, follow the guid step by step.
- Make sure that you select Eclipse IDE for JavaEE and the latest version.


### Maven
There are several ways to install Maven, one easy way is:
1. Open up Eclipse
2. Go to: Help -> Eclipse MarketPlace
3. Search by Maven
4. Click "Install" button at "Maven Integration for Eclipse" section
5. Follow installation guid step by step
6. After sucessfull installation right click on project Configure -> Convert to Maven Project

### TomEE
- Here is a step by step guid to install TomEE: http://tomee.apache.org/tomee-and-eclipse.html
- If you prefere an installation video tutorial: https://www.youtube.com/watch?v=Lr8pxEACVRI

### JSF
Here is two ways to get access to JSF framework:

**Eclipse Project Facets**

1.https://www.mkyong.com/jsf2/how-to-make-eclipse-ide-supports-jsf-2-0/

**Maven JSF dependency**
1. Locate the pom.xml file(Project -> pom.xml)
2. Open it and select pom.xml tab
3. Locate <dependencies></dependencies>
4. Copy and paste (Make sure to have the right/latest version):
<!-- https://mvnrepository.com/artifact/javax.faces/jsf-api -->
<dependency>
    <groupId>javax.faces</groupId>
    <artifactId>jsf-api</artifactId>
    <version>2.1</version>
    <scope>provided</scope>
</dependency>
5. If you already have it inside <dependencies></dependencies> tags then forget about step 4.
6. Save

### PrimeFaces
Here is two ways to get access to PrimeFaces library:

**PrimeFaces-jar**

Here is some information about PrimeFaces https://www.primefaces.org/gettingstarted/

1. Download latest version https://www.primefaces.org/downloads/
2. Right click on project and click on Build Path -> Configure Build Path
3. Click on Libraries tab
4. On the right side of the window click on Add External JARs
5. Locate primefaces.jar and open.
6. Click on Applay and Save
7. Now you are ready to use PrimeFaces

**Maven PrimeFaces dependency**
1. Locate the pom.xml file(Project -> pom.xml)
2. Open it and select pom.xml tab
3. Locate <dependencies></dependencies>
4. Copy and paste (Make sure to have the right/latest version):
<!-- https://mvnrepository.com/artifact/org.primefaces/primefaces -->
<dependency>
    <groupId>org.primefaces</groupId>
    <artifactId>primefaces</artifactId>
    <version>5.3</version>
</dependency>
5. If you already have it inside <dependencies></dependencies> tags then forget about step 4.
6. Save

### Built With
- Maven - Dependency Management
- JSF - Java framework for Web Applications
- PrimeFaces - Ligthweight library for Web Applications

### Authors
- Roberto Blanco Axelsson
- Saikat Talukder

### Acknowledgments
- Stackoverflow
- Youtube
- Google
































