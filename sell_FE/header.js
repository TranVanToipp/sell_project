
document.write(`
<div class="main">
<header class="header">
    <div class="grid wide">
        <div class="header__navbar">
            <div class="header__navbar-item header__navbar-logo">
                <a href="/sell_FE/" class="header__navbar-home-link">
                    <img src="/sell_FE/assets/img/logo.svg" alt="Hình ảnh logo home" class="header__navbar-logo-img">
                    <script>
                        
                    </script>
                    <img src="/sell_FE/assets/img/responsive/logo_1648529142.svg" alt="Hình ảnh logo home" class="header__navbar-logoresponsive-img">
                </a>
            </div>
            <div class="header__navbar-item header__navbar-address">
                <button class="header__navbar-city">
                    <span class="header__navbar-city-click-span"> Xem giá, tồn kho tại: </span>
                    <span class="header__navbar-city-click">
                        Hà nội
                        <i class="fa-solid fa-angle-down"></i>
                    </span>
                </button>
                <!-- address none -->
                <div class="header__navbar-city-address">
                    <p class="header__navbar-city-heading">
                        Chọn tỉnh thành để xem chính xác giá và khuyến mãi
                    </p>
                    <ul class="header__navbar-city-list">
                        <li class="a">Hà Nội</li>
                        <li class="a">Đà Nẵng</li>
                        <li class="a">TP HCM</li>
                        <li class="a">Thái Nguyên</li>
                        <li class="a">Hải Phòng</li>
                        <li class="a">Hải Dương</li>
                    </ul>
                </div>
                <form action="#" method="post">
                    <div class="header__search">
                        <div class="header__search-input-wrap">
                            <input type="text" name="searchInput"  class="header__search-input" placeholder="Bạn tìm gì...">
                        </div>
                        <input type="submit" id ="searchbt_simple" name="ok" value ="Search"/>
                        <!-- <i class="header__search-btn-icon fa-solid fa-magnifying-glass"></i> -->
                        <!-- <input href="" type="submit" name="ok"  class="header__search-btn">
                                <i class="header__search-btn-icon fa-solid fa-magnifying-glass"></i>
                        </input> -->
                    </div>
                </form>
                
            </div>
            <div class="header__navbar-item header__navbar-rightmenu">
                <a href="" class="header__navbar-menu-link header__navbar-item-hotline">
                    <img src="/sell_FE/assets/img/call.svg" alt="" class="header__navbar-menu-img">
                    <div class="header__navbar-menu-right header__navbar-call">
                        <span>Gọi mua hàng</span>
                        <span>0392518760</span>
                    </div>
                </a>
                <!-- Tìm cữa hàng bị bỏ đi -->
                <!-- <a href="" class="header__navbar-menu-link header__navbar-item-address">
                    <img src="/WebDiDong_PTPMCN/DiThoaiThongMinh-PTPMCN/assets/img/map.svg" alt="" class="header__navbar-menu-img">
                    <div class="header__navbar-menu-right header__navbar-address-find">
                        <span>Tìm cữa hàng</span>
                        <span>Gần bạn</span>
                    </div>
                </a> -->
                <a href="#" class="header__navbar-menu-link header__navbar-item-cart header__navbar-item-hover header__navbar-item-click">
                    <img src="/sell_FE/assets/img/cart.svg" alt="đây là giỏ hàng " class="header__navbar-menu-img">
                    <div class="header__navbar-menu-right header__navbar-cart-basket ">
                        <span>Giỏ hàng</span>
                        <span class="header__navbar-number-cart">
                            
                        </span>
                    </div>

                    <!-- LIST -->
                    <ul class="header__navbar-cart-list">
                        <h4>Sản phẩm mới thêm</h4>
                        
                            <li class="header__navbar-cart-item">
                                <div class="header__navbar-cart-img">
                                    <img src="'.$sanpham[0].'" alt="Hình sản phẩm" class="header__navbar-cart-img-link">
                                </div>
                                <div class="header__navbar-cart-name">
                                '.$sanpham[1].'
                                </div>
                                
                                <div class="header__navbar-cart-price">
                                    '.$sanpham[2].'
                                </div>
                            </li>
                                        
                        <span class="header__navbar-cart-list-span">
                            Tổng tiền: 10 ngan
                        </span>
                        <sup>đ</sup>
                    </ul>
                </a>
                <label for="nav-mobile-input" class="header__navbar-cart-menu">
                    <img src="/sell_FE/assets/img/responsive/menu_mb.svg" alt="menu responsive mobile tablet" class="header__navbar-cart-menu-img">
                </label>
                
                <input type="checkbox" hidden name="" class = "nav-input-check" id="nav-mobile-input">
                <!-- nav overlay responsive -->
                <label for="nav-mobile-input" class="nav__overlay">

                </label>

                <!-- nav mobile -->
                <nav class = "nav__mobile">
                    <div class="head-menu-mobile">
                        <img src="/sell_FE/assets/img/responsivemobi/lg_1648528949.svg" alt="" class="img-responsive">
                        <label for="nav-mobile-input" class="moby-close">
                            <span class="moby-close-icon">
                            <i class="fa-regular fa-circle-xmark"></i>
                            </span>
                        </label>
                    </div>
                    <ul class="nav__mobile-list">
                    
                            <li>
                                <a class="nav__mobile-link nav__mobile-link__account" href="#">
                                    <i class="fa-solid fa-user"></i>
                                    <span class="nav__mobile-link-login">
                                        Nguyen Van A
                                    </span>
                                </a>
                            </li> 

                            <li> 
                                <a class="nav__mobile-link nav__mobile-link__account" href="#">
                                    <i class="fa-solid fa-user"></i>
                                    <span class="nav__mobile-link-login">Đơn hàng đã mua</span>
                                </a>
                            </li>
                            <li> 
                                <a class="nav__mobile-link nav__mobile-link__account" href="#">
                                    <i class="fa-solid fa-user"></i>
                                    <span class="nav__mobile-link-login">Đổi mật khẩu</span>
                                </a>
                            </li>
                                
                            <li>
                                <a class="nav__mobile-link nav__mobile-link__account" href="#" >
                                    <i class="fa-solid fa-user"></i>
                                    <span class="nav__mobile-link-login">Đăng xuất</span>
                                </a>
                            </li>
                                <li>
                                    <a href="#" class="nav__mobile-link nav__mobile-link__account" >
                                        <span class="nav__mobile-link-login">
                                            Admin
                                        </span>
                                    </a>
                                </li>
                                  
                            <li class = "nav__mobile-item-acount">
                                <a href="#" class="nav__mobile-link">
                                    <i class="fa-solid fa-user"></i>
                                    <span class="nav__mobile-link-login">Đăng nhập</span>
                                </a>
                                <a href="#" class="nav__mobile-link nav__mobile-link-res">
                                    <i class="fa-solid fa-user"></i>
                                    <span class="nav__mobile-link-login">Đăng ký</span>
                                </a>
                            </li>
                           
                           
                        
                        <li>
                            <a href="" class="nav__mobile-link-acount">
                                <img src="/sell_FE/assets/img/responsivemobi/icon_home.svg" alt="" class="img-responsive">
                                Trang chủ
                            </a>
                        </li>

                        <li>
                            <a href="" class="nav__mobile-link-acountnav__mobile-link">
                            <img src="/sell_FE/assets/img/responsivemobi/icon_dt.svg" alt="" class="img-responsive">
                                Điện thoại
                            </a>
                        </li>
                        <li>
                            <a href="" class="nav__mobile-link-acount">
                            <img src="/sell_FE/assets/img/responsivemobi/icon_pk.svg" alt="" class="img-responsive">
                                Phụ kiện
                            </a>
                        </li>

                        <li>
                            <a href="" class="nav__mobile-link-carticon">
                            <img src="/sell_FE/assets/img/responsivemobi/carticon_mobi.svg" alt="icon logo cart" class="img-responsive">
                                <span class = "textgiohang">Giỏ hàng</span>
                                <span class="nbc">
                                
                                </span>
                            </a>
                        </li>
                        
                    </ul>
                </nav>
                <div class="header__navbar-item-lore-shared header__navbar-item-lore-shared-hover">
                    
                                <!-- <a href="#" class="header__navbar-item-fullName-link">Nguyen Van A</a> -->
                                <!-- <div class="header__navbar-item-box-user">
                                    <ul class="header__navbar-item-box-user-list">
                                        <li class="header__navbar-item-box-user-item"> <a href="#">Đổi mật khẩu</a></li>
                                        <li class="header__navbar-item-box-user-item"> <a href="#">Đơn hàng đã mua</a></li>
                                        <li class="header__navbar-item-box-user-item"><a href="#" >Đăng xuất</a></li>';
                                       <li class="header__navbar-item-box-user-item"><a href="#" >Admin</a></li>';
                                           
                                    </ul>
                                </div> -->  
                    <a href="/sell_FE/authen/login/login.html" class="header__navbar-item-login-link header__navbar-item-lore">Đăng nhập</a>
            
                    <a href="/sell_FE/authen/register/register.html" class="header__navbar-item-register-link header__navbar-item-lore">Đăng kí</a>
                            
                </div>
            </div>  
        </div>
    </div>
</header>   
<div class="container">
    <div class="header__navbar-bot">
        <div class="grid wide">
            <div class="header__navbar-bot-container">
                <ul class="header__navbar-bot-list">
                    <li class="header__navbar-bot-item">
                        <img src="/sell_FE/assets/img/navbar-hos/phone_1635241065.png" class="header__navbar-bot-img" alt="Điện thoại">
                        <span> Điện thoại</span>
                        </li>
                    <li class="header__navbar-bot-item">
                        <img src="/sell_FE/assets/img/navbar-hos/maytinhbang_1635241194.png" class="header__navbar-bot-img" alt="Máy tính bảng">

                        <span> Máy tính bản</span>
                    </li>
                    <li class="header__navbar-bot-item">
                        <img src="/sell_FE/assets/img/navbar-hos/latop_1635241226.png" class="header__navbar-bot-img" alt="Láp top">
                        <span> Láp top</span>
                    </li>
                    <li class="header__navbar-bot-item">
                        <img src="/sell_FE/assets/img/navbar-hos/tainghe_1635241251.png" class="header__navbar-bot-img" alt="Âm thanh">
                        <span>Âm thanh</span>
                    </li>
                    <li class="header__navbar-bot-item">
                        <img src="/sell_FE/assets/img/navbar-hos/phukien_1635241134.png" class="header__navbar-bot-img" alt="Phụ kiện">
                        <span> Phụ kiện</span>
                    </li>
                    <li class="header__navbar-bot-item">
                        <img src="/sell_FE/assets/img/navbar-hos/hang-cu.svg" class="header__navbar-bot-img" alt="Hàng cũ">
                        <span>Hàng cũ</span>
                    </li>
                    <li class="header__navbar-bot-item">
                        <img src="/sell_FE/assets/img/navbar-hos/dongho_1635241283.png" class="header__navbar-bot-img" alt="Thu cũ">
                        <span>Thu cũ</span>
                    </li>
                    <li class="header__navbar-bot-item">
                        <img src="/sell_FE/assets/img/navbar-hos/icon-thu-cu-3.svg" class="header__navbar-bot-img" alt="Smartwatch">
                        <span>Smartwatch</span>
                    </li>
                    <li class="header__navbar-bot-item">
                        <img src="/sell_FE/assets/img/navbar-hos/home_1635241313.png" class="header__navbar-bot-img" alt="SmartHome">
                        <span>SmartHome</span>
                    </li>
                    <li class="header__navbar-bot-item">
                        <img src="/sell_FE/assets/img/navbar-hos/new_1635241418.png" class="header__navbar-bot-img" alt="Tin công nghệ">
                        <span>Tin công nghệ</span>
                    </li>
                </ul>
            </div>
        </div>  
    </div> 


</div>


<!-- Modal Mobile -->
<nav class="nav-mobile">
<div class="nav-mobile-header">
    <i class="nav-mobile-check-icon fa-regular fa-circle-xmark"></i>
</div>
<ul class="nav-mobile-list">
   <li>
        <a href="" class="nav-mobile-link">Trang chủ</a>
    </li>
    <li>
        <a href="" class="nav-mobile-link">Điện thoại</a>
    </li>
    <li>
        <a href="" class="nav-mobile-link">Máy tính bảng</a>
    </li>
    <li>
        <a href="" class="nav-mobile-link">Gọi mua hàng</a>
    </li>
    <li>
        <a href="" class="nav-mobile-link">Tìm cữa hàng</a>
    </li>
    <li>
        <a href="" class="nav-mobile-link">Giỏ hàng</a>
    </li>
</ul>
</nav>
   
`)
    


    





   
    
