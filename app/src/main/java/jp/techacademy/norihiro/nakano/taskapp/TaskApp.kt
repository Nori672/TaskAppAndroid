package jp.techacademy.norihiro.nakano.taskapp

import android.app.Application
import io.realm.Realm

//Taskクラスと接続するRealmデータベース
class TaskApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this) //Realmを初期化。特別な設定を行わずデフォルトの設定を使う場合はこのように記述
    }
}