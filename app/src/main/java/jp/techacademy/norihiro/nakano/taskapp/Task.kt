package jp.techacademy.norihiro.nakano.taskapp

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.io.Serializable
import java.util.Date

open class Task: RealmObject(), Serializable {
    var title: String = ""      // タイトル
    var contents: String = ""   // 内容
    var date: Date = Date()     // 日時
    var category: String = ""   //（課題用に追加）カテゴリー

    // idをプライマリーキーとして設定
    @PrimaryKey
    var id: Int = 0
}