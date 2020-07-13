package com.ciphersnippet.myauthserver.dao;

import com.ciphersnippet.myauthserver.model.UserEntity;

public interface OAuthDAOService {

	public UserEntity getUserDetails(String emailId);
}
