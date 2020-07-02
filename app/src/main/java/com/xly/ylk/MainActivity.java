package com.xly.ylk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xly.encryptutils.AesUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String key = "xuexi.iefeel.com";
        //加密
        String encsome = AesUtil.encrypt(key, "要加密的内容");
        //解密
        String decsome = AesUtil.decrypt(key, "要解密的内容");

    }
}