package web.api

class User {

    String email
    String password
    Date created_at
    Date updated_at

    static hasMany = [feeds: Feed, stories: Story]

    static constraints = {
        email email: true, blank: false, unique: true
    }
    static mapping = {
        table "users"
        autoTimestamp true
    }
}
