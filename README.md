This DB2Triples modification (a) support Oracle Databases and (b) implements the language column feature.

The language column feature adds the property **rrx:languageColumn** to the [R2RML language](https://www.w3.org/TR/r2rml/). This property was first created by [Vladimir Alexiev](https://ontotext.com/author/vladimir/) in his [Perl implementation](https://metacpan.org/pod/RDF::RDB2RDF::R2RML#Language). The namespace rrx of the property is <http://purl.org/r2rml-ext/>, so to use it you only need to add

```@prefix rrx: <http://purl.org/r2rml-ext/>.```

at the beginning of your R2RML file.

[H2 Database support](https://github.com/gesteban/db2triples/commit/3d3b20cc7210ea2e24cdde2c74f85b67a4d91abf) by @santteegt (https://santteegt.github.io/)

[Original project](https://github.com/antidot/db2triples) by @antidot (http://www.antidot.net/)

LGPL Licence 2.1

Building jar
============

To build DB2Triples jar, you need to use Maven (http://maven.apache.org/) which will provide to you all the necessary package to compile. The classical way is the command:

```
mvn package
```

This will provide a file "db2triples-<version number>.jar" in the "target" directory according to default configuration of Maven.


Executing jar
==============

You can also compile and execute directly the jar from Maven build. This operation requires to copy dependencies into working folder. Use following commands:

```
mvn dependency:copy-dependencies
java -cp target/dependency/*:target/db2triples-<version number>.jar net.antidot.semantic.rdf.rdb2rdf.main.Db2triples
```

When using Windows cmd, the separator for the classpath argument ':' is to be replaced by ';'.

The execution of this command will prompt its usage:

```
 -b,--database <database_name>        database name
 -d,--driver <driver>                 Driver to use (default :
                                      com.mysql.jdbc.Driver )
 -f                                   Force loading of existing repository
                                      (without remove data)
 -i,--base_uri <base_uri>             Base URI (default :
                                      http://foo.example/DB/)
 -l,--url <url>                       Database URL (default :
                                      jdbc:mysql://localhost/)
 -m,--mode <mode>                     Mandatory conversion mode, 'r2rml'
                                      for R2RML and 'dm' for Direct
                                      Mapping
 -n,--native_output <nativeOutput>    Native store output directory
 -o,--output <output>                 Output RDF filename (default :
                                      output)
 -p,--pass <password>                 Database password
 -q,--sparql_output <sparql_output>   Transformed graph output file
                                      (optionnal if sparql option is not
                                      specified, default : sparql_output
                                      otherwise)
 -r,--r2rml_file <r2rml_file>         R2RML config file used to convert
                                      relationnal database into RDF terms.
 -s,--sparql <sparql>                 Sparql transform request file
                                      (optionnal)
 -t,--format <format>                 RDF syntax output format ('RDFXML',
                                      'N3', 'NTRIPLES' or 'TURTLE')
 -u,--user <user_name>                Database user name
 -v,--version <version>               Version of norm to use (1 = Working
                                      Draft 20 September 2011 (default), 2
                                      = Working Draft 23 March 2011)
```


Usage example
=============

```
java -cp target/dependency/*;target/db2triples-1.0.3-SNAPSHOT.jar net.antidot.semantic.rdf.rdb2rdf.main.Db2triples -m r2rml -r C:/r2rml-file.ttl -d oracle.jdbc.driver.OracleDriver -l jdbc:oracle:thin:@//some.url.and.its:port/ -u USERNAME -p PASSWORD -b database_name
```
