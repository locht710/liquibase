package liquibase.datatype.core;

import liquibase.datatype.DataTypeInfo;
import liquibase.datatype.LiquibaseDataType;

@DataTypeInfo(name="float", aliases = {"java.sql.Types.FLOAT","java.lang.Float"}, minParameters = 0, maxParameters = 2, priority = LiquibaseDataType.PRIORITY_DEFAULT)
public class FloatType  extends LiquibaseDataType {


    //sqlite
    //        } else if (columnTypeString.equals("REAL") ||
//                columnTypeString.toLowerCase(Locale.ENGLISH).contains("float")) {
    //            type = new FloatType("REAL");



    //postgres
    //        } else if (type.toDatabaseDataType().toLowerCase().startsWith("float8")) {
//            type.setDataTypeName("FLOAT8");
//        } else if (type.toDatabaseDataType().toLowerCase().startsWith("float4")) {
//            type.setDataTypeName("FLOAT4");

}