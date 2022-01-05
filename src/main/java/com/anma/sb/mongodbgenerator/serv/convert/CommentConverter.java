package com.anma.sb.mongodbgenerator.serv.convert;

import com.anma.sb.mongodbgenerator.models.Comment;
import com.anma.sb.mongodbgenerator.models.web.CommentWeb;

public interface CommentConverter {

    public Comment convert(CommentWeb commentWeb);
    public CommentWeb convert(Comment comment);
}
