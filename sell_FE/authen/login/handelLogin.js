function login() {
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    const data = {
        username: username,
        password: password
    };
    console.log(data);
    const api = 'http://localhost:8888/api/v1/auth/signin';
    fetch(api, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    })
    .then(function(response) {
        if (response.ok) {
            return response.json(); // Parse the response body as JSON
        } else {
            throw new Error('Login failed'); // Throw an error if the response is not successful
        }
    })
    .then(function(data) {
        // Access the accessToken from the response
        const accessToken = data.accessToken;
        if(accessToken){
            localStorage.setItem('token', accessToken);
            window.location.href = 'http://127.0.0.1:5500/sell_FE/';
        } else {
            showErrorToast("Thất bại!", "Tài khoản hoặc mật khẩu sai. Vui lòng kiểm tra lại!", "error", 5000);
        }
    })
    .catch(function(error) {
        showErrorToast("Có lỗi!", "Có lỗi đã xảy ra. Vui lòng kiểm tra lại!", "error", 5000);
        console.log('Error');
    });
}