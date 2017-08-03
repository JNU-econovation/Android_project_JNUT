package com.example.chaeyeon.registeration.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class MyTopPostsFragment extends PostListFragment {

    public MyTopPostsFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // [START my_top_posts_query]
        // 자신의 포스트 중에 별점을 가장 많이 받은 것
        //사용자 ID를 기준으로 데이터베이스의 특정 경로에 있는 사용자의 게시물을 각 게시물의 별표 수에 따라 정렬한 결과를 동기화
        String myUserId = getUid();
        Query myTopPostsQuery = databaseReference.child("user-posts").child(myUserId).orderByChild("starCount");
        // [END my_top_posts_query]

        return myTopPostsQuery;
    }
}