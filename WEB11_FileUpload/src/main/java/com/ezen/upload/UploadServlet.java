package com.ezen.upload;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/upload.do")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// 1. 파일이 업로드 될 타겟폴더이름을 String  변수에 저장해둡니다
		String savaPath = "upload";
		
		// 2. 업로드될 파일의 용량을 제한하기 위한 용량값을  int 변수에 저장해둡니다
		int uploadFileSizeLimit = 5 * 1024 * 1024; // 1바이트 기준  1024byte = 12Kbyte
		// 1024KByte = 1MB
		
		// 3. 인코딩 방식을 String 변수에 저장해둡니다
		String encType = "UTF-8";
		
		//4. 업로드될 서버의 실제 저장장소를 설정하여 String 변수에 저장해 둡니다
		ServletContext context = getServletContext();
		String uploadFilePath = context.getRealPath( savaPath ); //savePath : "upload"
		
		System.out.println(uploadFilePath);
		
		MultipartRequest multi = new MultipartRequest( 
			request, //  enctype="multipart/form-data" 로 보낸 파라미터들은 
			// 일반 request로 전달받을수 없습니다. 
			// 따라서 MultipartRequest  에 request 를 넣어서 복합사용되게 설정합니다
			uploadFilePath,  // 서버상의 실제 디렉토리
			1024*1024*5,  //uploadFileSizeLimit,  //최대 업로드 파일 크기
			"UTF-8" , //encType,  // 인코딩 방법
			new DefaultFileRenamePolicy()
			// 업로드 파일과 동일 이름이 이미 존재하면 새이름 부여해주는 역할을 합니다.
		);
		//System.out.println("request 로 처리 :  " + request.getParameter("name") );
		// request는  multipart/form-data 로 전달된 파라미터가 모두 null 로 수신됩니다.
		//System.out.println("multi 로 처리 :  " + multi.getParameter("name") );
		
		//MultipartRequest 객체가 생성되는 순간 업로드 되는 파일은 해당 경로에 업로드를 완료합니다
		// jsp 파일의 form 에서 전달된 파일의 이름 및 그 외 항목들을 파라미터로 추출
		String name = multi.getParameter("name");
		String title = multi.getParameter("title");
		String fileName = multi.getFilesystemName("uploadFile"); //  전달된 파일이름추출
		
		request.setAttribute("name", name);
		request.setAttribute("title", title);
		request.setAttribute("fileName", fileName);
		
		RequestDispatcher dp = request.getRequestDispatcher("01_result.jsp");
		dp.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
