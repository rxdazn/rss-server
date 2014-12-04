package web.api

class Story {

    String title
    String content
    String link
    String status
    Date pub_at

    static belongsTo = [feed: Feed, user: User]

    static mapping = {
        table "stories"
        autoTimestamp true
    }
}
