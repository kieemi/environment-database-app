## Why an app like this ## 

The main goal of this application is to create a user-friendly work environment for experts to read and store standardized data about subjects of protection in Natura 2000 Sites of the European Union. It's also a good challenge which will improve my coding skills.

## Relation ## 

A few things need to be explained about this database scheme.
I collaborated with my colleagues from the Regional Directorate for Environmental Protection in Wrocław to develop a standard for collecting spatial data for Plans of Protective Actions on Natura 2000 sites [link to it in this repository](https://github.com/kieemi/environment-database-app/blob/master/Standard%20to%20collect%20spatial%20data%20for%20Plans%20of%20Protective%20Actions%20on%20Natura%202000%20sites%20(polish%20version).zip). The data format used for collection is the ESRI Shapefile, which is roughly 20 years old but is still widely used today. Data descriptions for shapefiles are stored in Data Base Files (.dbf), in which column names cannot exceed 10 characters in length. This limitation explains the abbreviated column names in the database (apart from key columns). However, this design allows for direct data copying between shapefiles and PostGIS and vice-versa using any GIS program. While the column names have their full descriptions in the Java code, I won't be providing comment descriptions in the English SQL DDL, at least not for the time being.

I've also introduced a guid_ column as a sort of label for data across all tables. It's deliberately used as an "additional global unique key" to establish 1-1 and 1-N relationships between tables. This way, data can be edited and viewed in GIS programs without a direct database connection, solely using the shapefile and database files. If you're interested in seeing how this functions in QGIS, please click this [link](https://docs.qgis.org/3.4/en/docs/user_manual/working_with_vector/attribute_table.html#creating-one-or-many-to-many-relations), which show it works in QGIS.
![image](https://github.com/kieemi/environment-database-app/blob/master/data%20relation.jpg)

## How it works ## 

At this stage, the app provides a simple view of sample data from the database and a REST API.

## How it supose to work in the future ## 

I'm aiming to create a CRUD web app and a REST API to manage the non-spatial, standardized portion of data in the PostGIS database and to generate table views and reports from it. In the future, I may add some spatial data editing tools.


