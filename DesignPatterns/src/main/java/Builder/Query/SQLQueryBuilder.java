package Builder.Query;

public interface SQLQueryBuilder {
    SQLQueryBuilder select(String table, String... columns);

    SQLQueryBuilder where(String column, String operator, String value);

    SQLQueryBuilder limit(int start, int offset);

    SQLQueryBuilder orderBy(String column, String order);

    String build();
}
