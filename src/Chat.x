typedef string Chaine<255>;
typedef Chaine MessageList<255>;

program CHAT_PROG {
    version CHAT_VERSION {
       int connect(Chaine nickname)=0;
       void sendMessage(Chaine message)=1;
       MessageList resyncMessages(void)=2;
    }=1;
} = 0x22222220;