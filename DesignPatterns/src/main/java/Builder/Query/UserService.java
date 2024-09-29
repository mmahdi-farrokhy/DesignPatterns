package Builder.Query;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserService {
    private SQLQueryBuilder queryBuilder;

    public void fetchAllUsers() {
        this.queryBuilder
                .select("users")
                .where("users.id", ">", "10")
                .orderBy("users.id", "asc")
                .limit(0, 10)
                .build();
    }
}
