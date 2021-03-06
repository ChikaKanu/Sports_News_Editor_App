package com.codeclan.example.SportsNews.projections;

import com.codeclan.example.SportsNews.models.Article;
import com.codeclan.example.SportsNews.models.Category;
import com.codeclan.example.SportsNews.models.Journalist;
import org.springframework.data.rest.core.config.Projection;


@Projection(name = "embedCategory", types = Article.class)
public interface ArticleProjection {
 Long getId();

 String getHeadline();

 String getSummary();

 String getFullStory();

 String getDateCreated();

 String getImage();

 int getReadCount();

 Category getCategory();

 Journalist getJournalist();
}
