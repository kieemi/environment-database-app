[![HitCount](http://hits.dwyl.com/kieemi/environment-database-app.svg)](http://hits.dwyl.com/kieemi/environment-database-app)
# environment-database-app

## Why app like ## 

Main goal of this application is to create user-friendly work environment for experts to read and store standarized data about subjects of protection in Natura 2000 Sites of European Union. 

## Relation ## 

Few things need to t obe explained about this database scheme.
Few months ago I wrote in collaboration with my colleagues from Regional Directorate for Environmental Protection in Wrocław a standard to collect spatial data for Plans of Protective Actions on Natura 2000 sites. Data format to collect data is ESRI Shapefile, which is about 20 years old, but widely used even nowadays. Data description for shapefiles are stored i Data Base Files (.dbf), in which data columns names can't be longer than 10 characters. That's why column names in database are so short (beside key columns). But by this, we can directly copy data from shapefiles to postgis and export it from postgis to shapefiles using any GIS program. 

Other thing, that might seem a mistake in database modeling is redundant guid_ column in multiple tables. It's used deliberately as an "aditional global unique key" to create 1-1 and 1-N relations beetwen tables, so data can be edited and vieved in GIS programs without direct connection to database, just by using shapefile and data base files. For interested, click this [link](https://docs.qgis.org/3.4/en/docs/user_manual/working_with_vector/attribute_table.html#creating-one-or-many-to-many-relations), which show it works in QGIS.
![image](https://github.com/kieemi/environment-database-app/blob/master/data%20relation.jpg)





 (I will  soon add it to repository files).

But main problem is that experts would rather use simple app to click on that will take them by the hand, rather than read standards and create relations in spatial data by themselves. It's obvious that it will have generate other advantages, but I'll write about them soon.

At this stage I'm aiming to create CRUD web app and REST API to manage nonspatial, standarized part of data in PostGIS database to create table views and reports from it.

That's all for today. I'll expand README file when I add a database scheme and some inserts for database...
