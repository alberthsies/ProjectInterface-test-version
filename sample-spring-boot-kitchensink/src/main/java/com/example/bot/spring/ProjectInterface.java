package com.example.bot.spring;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import com.linecorp.bot.model.profile.UserProfileResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.google.common.io.ByteStreams;

import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.client.MessageContentResponse;
import com.linecorp.bot.model.ReplyMessage;
import com.linecorp.bot.model.action.MessageAction;
import com.linecorp.bot.model.action.PostbackAction;
import com.linecorp.bot.model.action.URIAction;
import com.linecorp.bot.model.event.BeaconEvent;
import com.linecorp.bot.model.event.Event;
import com.linecorp.bot.model.event.FollowEvent;
import com.linecorp.bot.model.event.JoinEvent;
import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.PostbackEvent;
import com.linecorp.bot.model.event.UnfollowEvent;
import com.linecorp.bot.model.event.message.AudioMessageContent;
import com.linecorp.bot.model.event.message.ImageMessageContent;
import com.linecorp.bot.model.event.message.LocationMessageContent;
import com.linecorp.bot.model.event.message.StickerMessageContent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.event.source.GroupSource;
import com.linecorp.bot.model.event.source.RoomSource;
import com.linecorp.bot.model.event.source.Source;
import com.linecorp.bot.model.message.AudioMessage;
import com.linecorp.bot.model.message.ImageMessage;
import com.linecorp.bot.model.message.ImagemapMessage;
import com.linecorp.bot.model.message.LocationMessage;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.StickerMessage;
import com.linecorp.bot.model.message.TemplateMessage;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.model.message.imagemap.ImagemapArea;
import com.linecorp.bot.model.message.imagemap.ImagemapBaseSize;
import com.linecorp.bot.model.message.imagemap.MessageImagemapAction;
import com.linecorp.bot.model.message.imagemap.URIImagemapAction;
import com.linecorp.bot.model.message.template.ButtonsTemplate;
import com.linecorp.bot.model.message.template.CarouselColumn;
import com.linecorp.bot.model.message.template.CarouselTemplate;
import com.linecorp.bot.model.message.template.ConfirmTemplate;
import com.linecorp.bot.model.response.BotApiResponse;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;

import lombok.NonNull;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;

import java.net.URI;

public class ProjectInterface {
	//TODO define image addresses
	//private final String [] imageNames;// = new String[10] {"gather.jpg","","","","","","","","",""};
	
	
	public String inputText;
	public String state;			//define the state i.e. init, search, book, enq
	public Queue<String> buffer;
	
	public String replyType;		//i.e. text, image, carousel, confirm, unknown
	public String replyText;
	public String replyImageAddress;
	public CarouselTemplate replyCarousel;
	
	public ProjectMasterController controller = new ProjectMasterController();
	
	public ProjectInterface() {}
	
	//this will change the reply type & reply 
	public void process(String text) {
		if (checkInitState()) {
			//call init controller
			
			replyText = "Hello! How may I help you today?";
			replyType = "text";
		} else if (checkSearchState()) {
			//call tour search controller
			
			//TODO do it later
		} else if (checkBookState()) {
			//call booking controller
			
			
		} else if (checkEnqState()) {
			//call enquiry controller
		} else if (checkFAQ()) {
			//call FAQ handler
		} else {
			//call unknown controller
			
			//test case
			replyText = "chatbot received: " + text;
			replyType = "text";
		}
			
	}
	
	public boolean checkInitState() {
		//TODO
		
		//for test case, remove when you're actually done
		return false;
	}
	
	public boolean checkSearchState() {
		//TODO
		
		//for test case, remove when you're actually done
		return false;		
	}
	
	public boolean checkBookState() {
		//TODO
		
		//for test case, remove when you're actually done
		return false;
	}
	
	public boolean checkEnqState() {
		//TODO
		
		//for test case, remove when you're actually done
		return false;
	}
	
	public boolean checkFAQ() {
		//TODO
		
		//for test case, remove when you're actually done
		return false;
	}

}
