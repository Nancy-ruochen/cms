package com.briup.cms.service;

import com.briup.cms.bean.Article;
import org.springframework.stereotype.Service;

@Service
public interface IArticleService {
    void addArticle(Article article);
}
