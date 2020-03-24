db.createUser(
  {
    pwd : "password",
	user : "oauth-user",
	roles : [
	  {
	    role : "readWrite",
		db : "oauth-db"
	  }
	]
  }
)