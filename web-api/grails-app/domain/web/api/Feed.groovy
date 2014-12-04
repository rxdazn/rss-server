package web.api

class Feed {

    String url
    String color
    String title
    String description
    String language
    Date last_build_at
    Integer ttl
    Date created_at
    Date updated_at

    static hasMany = [stories: Story]
    static belongsTo = [user: User]

    static constraints = {
    }
    static mapping = {
        table "feeds"
        autoTimestamp true
    }
}
