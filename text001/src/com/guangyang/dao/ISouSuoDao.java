package com.guangyang.dao;

import com.guangyang.bean.New;
import com.guangyang.bean.SupDemBean;


import java.util.List;

public interface ISouSuoDao {
    //模糊查询（新闻）news
    public List<New> getNews(String like);
    //模糊查询（商业）suo_dem
    public List<SupDemBean> getSupDems(String like);
}
