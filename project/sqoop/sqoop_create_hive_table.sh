#file location $HOME/project/sqoop/sqoop_create_hive_table.sh
#Provide argument as the table that need to be imported.
#Error if table already exists
. /$HOME/project/conf/mysql.properties
#--map-column-hive image=String \
echo username - $mysql_user
echo database name - $mysql_dbname

echo "Table name passed is:: $1"
sqoop create-hive-table \
--connect jdbc:mysql://localhost:3306/$mysql_dbname \
--username $mysql_user \
--password $mysql_password \
--create-hive-table \
--hive-database hdpdlake \
--table $1 \
--map-column-hive image=String 
