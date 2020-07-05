package com.xly.ylk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.xly.encryptutils.AesUtil;
import com.xly.encryptutils.BaseUtil;
import com.xly.encryptutils.DesUtil;
import com.xly.encryptutils.RsaUtil;

import java.io.UnsupportedEncodingException;
import java.security.KeyPair;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String key = "12345678";
        //加密
        String encsome = AesUtil.encrypt(key, "要加密的内容");
        //解密
        String decsome = AesUtil.decrypt(key, "要解密的内容");

        String dess = DesUtil.encryptDES("我喜欢你11511515151561515151511515121521521521",key);

        String a = "caonimalegebi";
        String bs = BaseUtil.encode(a.getBytes());
        byte[] rs = BaseUtil.decode(bs);


        KeyPair keys = RsaUtil.generateRSAKeyPair();
        Log.d("ttt",BaseUtil.encode(keys.getPublic().getEncoded()));
    }
}