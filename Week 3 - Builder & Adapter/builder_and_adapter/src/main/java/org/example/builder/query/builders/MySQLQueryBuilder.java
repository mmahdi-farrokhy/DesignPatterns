package org.example.builder.query.builders;

import org.example.builder.query.SQLQueryBuilder;

public class MySQLQueryBuilder implements SQLQueryBuilder {

    private String selectSQL;
    private String limitSQL;
    private String whereSQL;
    private String orderSQL;
    private String query;

    public static SQLQueryBuilder aSQLQuery() {
        return new MySQLQueryBuilder();
    }

    @Override
    public SQLQueryBuilder select(String table, String... columns) {
        StringBuilder columnsToFetch = new StringBuilder("*");

        if (columns.length > 0) {
            columnsToFetch = new StringBuilder();
            for (int columnIndex = 0; columnIndex < columns.length; columnIndex++) {
                String columnName = columns[columnIndex];
                columnsToFetch.append(columnName);
                if (columnIndex < columns.length - 1) {
                    columnsToFetch.append(",");
                }
            }
        }

        this.selectSQL = "SELECT " + columnsToFetch + " FROM " + table;
        this.query = this.selectSQL;
        return this;
    }

    @Override
    public SQLQueryBuilder where(String column, String operator, String value) {
        this.whereSQL = "WHERE " + column + operator + value;
        this.query += "\n" + this.whereSQL;
        return this;
    }

    @Override
    public SQLQueryBuilder limit(int start, int offset) {
        this.limitSQL = "LIMIT " + start + " OFFSET " + offset;
        this.query += "\n" + this.limitSQL;
        return this;
    }

    @Override
    public SQLQueryBuilder orderBy(String column, String order) {
        this.orderSQL = "ORDER BY " + column + " " + order;
        this.query += "\n" + this.orderSQL;
        return this;
    }

    @Override
    public String build() {
        return query;
    }
}
