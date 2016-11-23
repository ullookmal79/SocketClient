package com.example.student.socketclient;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * SQLite 데이터베이스 파일은 이미 그 위치가 정해져있고,
 * data/data/나의 패키지명/database
 * 일반 유저는 절대로 접근할 수 없는 내부 스토리지이기 때문에
 * 프로그래밍적으로 데이터베이스 파일 생성 및 DDL을 수행해야 하는데,
 * 이 작업은 개발자에게 번거로운 작업이므로
 * SQLiteOpenHelper 클래스가 지원된다...
 */

public class MyOpenHelper extends SQLiteOpenHelper{
    public MyOpenHelper(Context context) {
        super(context, "chat.sqlite", null, 1);

    }
    /*
            data/data/나의 패키지명/database 위치에
             파일이 지정한 이름과 동일한 파일이 없다면 아래의 메서드 호출
        */
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    //이미 같은 파일명이 존재하되, version 숫자가 달라야 한다.
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
