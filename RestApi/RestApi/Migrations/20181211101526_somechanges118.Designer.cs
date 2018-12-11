﻿// <auto-generated />
using System;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Migrations;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;
using RestApi.Data;

namespace RestApi.Migrations
{
    [DbContext(typeof(DataContext))]
    [Migration("20181211101526_somechanges118")]
    partial class somechanges118
    {
        protected override void BuildTargetModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder
                .HasAnnotation("ProductVersion", "2.1.2-rtm-30932")
                .HasAnnotation("Relational:MaxIdentifierLength", 128)
                .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

            modelBuilder.Entity("RestApi.Models.CompanyInfo", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("CompanyName");

                    b.Property<string>("CompanyPhone");

                    b.HasKey("ID");

                    b.ToTable("CompanyInfos");
                });

            modelBuilder.Entity("RestApi.Models.Employee", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<int>("Is_Boss");

                    b.Property<string>("password");

                    b.Property<string>("username");

                    b.HasKey("ID");

                    b.ToTable("Employees");
                });

            modelBuilder.Entity("RestApi.Models.Good", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<int>("DetailID");

                    b.Property<int?>("SupplierID");

                    b.HasKey("ID");

                    b.HasIndex("DetailID")
                        .IsUnique();

                    b.HasIndex("SupplierID");

                    b.ToTable("Goods");
                });

            modelBuilder.Entity("RestApi.Models.GoodDetail", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("Description");

                    b.Property<int>("Is_Discontinued");

                    b.Property<string>("Name");

                    b.Property<int>("PLU");

                    b.Property<double>("Price");

                    b.HasKey("ID");

                    b.ToTable("GoodDetails");
                });

            modelBuilder.Entity("RestApi.Models.GoodOrder", b =>
                {
                    b.Property<int>("GoodId");

                    b.Property<int>("OrderId");

                    b.Property<int>("GoodOrderID");

                    b.Property<int>("Qtty");

                    b.Property<double>("Unit_Price");

                    b.HasKey("GoodId", "OrderId");

                    b.HasIndex("OrderId");

                    b.ToTable("GoodOrders");
                });

            modelBuilder.Entity("RestApi.Models.Order", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("OrderCode");

                    b.Property<double>("OrderTotalPrice");

                    b.Property<int>("UserRef");

                    b.HasKey("ID");

                    b.HasIndex("UserRef");

                    b.ToTable("Orders");
                });

            modelBuilder.Entity("RestApi.Models.Supplier", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<int>("CompanyInfoRef");

                    b.HasKey("ID");

                    b.HasIndex("CompanyInfoRef")
                        .IsUnique();

                    b.ToTable("Suppliers");
                });

            modelBuilder.Entity("RestApi.Models.User", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("email");

                    b.Property<string>("password");

                    b.Property<string>("username");

                    b.HasKey("ID");

                    b.ToTable("Users");
                });

            modelBuilder.Entity("RestApi.Models.UserInfo", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("Address");

                    b.Property<string>("City");

                    b.Property<int>("CompanyInfoRef");

                    b.Property<string>("Country");

                    b.Property<string>("FirstName");

                    b.Property<string>("LastName");

                    b.Property<string>("Phone");

                    b.Property<int>("UserRef");

                    b.HasKey("ID");

                    b.HasIndex("CompanyInfoRef")
                        .IsUnique();

                    b.HasIndex("UserRef")
                        .IsUnique();

                    b.ToTable("UserInfos");
                });

            modelBuilder.Entity("RestApi.Models.Good", b =>
                {
                    b.HasOne("RestApi.Models.GoodDetail", "Detail")
                        .WithOne("Good")
                        .HasForeignKey("RestApi.Models.Good", "DetailID")
                        .OnDelete(DeleteBehavior.Cascade);

                    b.HasOne("RestApi.Models.Supplier", "Supplier")
                        .WithMany("Goods")
                        .HasForeignKey("SupplierID");
                });

            modelBuilder.Entity("RestApi.Models.GoodOrder", b =>
                {
                    b.HasOne("RestApi.Models.Good", "Good")
                        .WithMany("GoodOrders")
                        .HasForeignKey("GoodId")
                        .OnDelete(DeleteBehavior.Cascade);

                    b.HasOne("RestApi.Models.Order", "Order")
                        .WithMany("GoodOrders")
                        .HasForeignKey("OrderId")
                        .OnDelete(DeleteBehavior.Cascade);
                });

            modelBuilder.Entity("RestApi.Models.Order", b =>
                {
                    b.HasOne("RestApi.Models.User", "User")
                        .WithMany("Orders")
                        .HasForeignKey("UserRef")
                        .OnDelete(DeleteBehavior.Cascade);
                });

            modelBuilder.Entity("RestApi.Models.Supplier", b =>
                {
                    b.HasOne("RestApi.Models.CompanyInfo", "CompanyInfo")
                        .WithOne("Supplier")
                        .HasForeignKey("RestApi.Models.Supplier", "CompanyInfoRef")
                        .OnDelete(DeleteBehavior.Cascade);
                });

            modelBuilder.Entity("RestApi.Models.UserInfo", b =>
                {
                    b.HasOne("RestApi.Models.CompanyInfo", "CompanyInfo")
                        .WithOne("UserInfo")
                        .HasForeignKey("RestApi.Models.UserInfo", "CompanyInfoRef")
                        .OnDelete(DeleteBehavior.Cascade);

                    b.HasOne("RestApi.Models.User", "User")
                        .WithOne("UserInfo")
                        .HasForeignKey("RestApi.Models.UserInfo", "UserRef")
                        .OnDelete(DeleteBehavior.Cascade);
                });
#pragma warning restore 612, 618
        }
    }
}
