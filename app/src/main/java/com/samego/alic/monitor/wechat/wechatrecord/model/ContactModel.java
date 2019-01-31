package com.samego.alic.monitor.wechat.wechatrecord.model;

import android.content.Context;

import com.samego.alic.monitor.wechat.wechatrecord.bean.Contact;
import com.samego.alic.monitor.wechat.wechatrecord.model.listener.OnGetContactListener;

import java.util.List;

public interface ContactModel {
    /**
     * 获取联系人列表
     *
     * @param context  上下文
     * @param listener 监听
     */
    void getContactList(Context context, OnGetContactListener listener);

    void syncContactMessage(Context context, List<Contact> contactList);
}
